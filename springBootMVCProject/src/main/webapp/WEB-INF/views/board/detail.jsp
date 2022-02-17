<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상세 조회</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>  
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
</head>
<body>
	<h1>게시물 상세 조회</h1>
	<form action="update" method="post">
		<div class="form-group">
		<!-- board번호는 반드시 넘긴다..  -->
			<input type="hidden" class="form-control" id="bno" name="bno" value="${board.bno}">
		</div>
		<div class="form-group">
			<label for="title">title:</label>
			<input type="text" class="form-control" id="title" name="title" value="${board.title}">
		</div>
		<div class="form-group">
			<label for="writer">writer:</label>
			<input type="text" class="form-control" id="writer" name="writer" value="${board.writer}">
		</div>
		<div class="form-group">
			<label for="content">content:</label>
			<input type="text" class="form-control" id="content" name="content" value="${board.content}">
			
		</div>
			<input type="hidden" name="regdate" value="${board.regdate}">
			
		<div class="form-group">
			<input type="submit" value="업데이트하기">
			<input type="button" id ="delButton" value="삭제하기">
			<input type="button" id ="searchButton" value="조회하기">
		</div>
	</form>
	
	<hr>
	<!--댓글 추가  -->
		<div>
		    <button data-toggle="modal" data-target="#myModal"
		     		class="btn btn-warning pull-right" id="addReply"
		     		data-msg="add" data-myname="jin">
		     		댓글추가
		     </button>
	   </div>
	
		<table class="table table-striped table-bordered  table-hover">
		    <thead >
			    <tr>
			       <th>댓글번호</th>
			       <th>내용</th>
			       <th>작성자</th>
			    </tr>
		    </thead>
		    <tbody id ="replyTable" data-toggle ="modal"> <!--  data-target="#myModal" -->
		     </tbody>
	  	</table>
		<div id="myModal" class="modal fade " role="dialog">
	      <div class="model_dialog">
	        Modal content
	        <div class="modal-content">
	          <div class="modal-header">
	            <button type="button" class="close" data-dismiss="modal">&times;</button>
	            <h4 class="modal-title">modal-title변경 Modal Header</h4>
	          </div>
			<div class="modal-body">
				    
				   <input type="hidden" name="rno"class="form-control">
	               <label>댓글내용</label>
	               <textarea  name="reply" rows="5" cols="80" class="form-control"></textarea>
	               <label>작성자</label>
	               <input type="text" name="replyer" class="form-control">
	         </div>
	          <div class="modal-footer">
	            <button id = "modalSaveBtn" class="btn btn-info">Save(insert or update)</button>
	            <button id = "modalDelBtn" class="btn btn-info"  >Delete</button>
	            <button type="button" class="btn btn-default"   data-dismiss="modal" >Close</button>
	          </div>
	        </div>
	      </div>
	    </div>
		
		<script>
			$.ajax({
				url:"/myapp/replies/list/" + ${board.bno},
				success:function(responseData){
					//alert(responseData)
					console.log(responseData)
					printList(responseData);
					}
				});
			function printList(arr){
					var str = "";
				$.each(arr, function(index, item){	//룹을 도는 함수 제이쿼리에서는 each
					str += "<tr>";
		    		str += "<td>" + "<span class='badge'>" + index +"</span>" + item.rno + "</td>";
		    		str += "<td>" +  item.reply + "</td>";
		    		str += "<td>" +  item.replyer + "</td>";
		    		str += "</tr>";
					$("#replyTable").html(str);

					});		
				}
		</script>
	
		<script>
			$(function(){
				$("#delButton").click(function(){
					if(confirm("삭제")){
						location.href ="delete?bno=${board.bno}";
	
						}
					});
				$("#searchButton").click(function(){
						location.href ="list";
					});
				
				$("#modalSaveBtn").click(function(){
					alert("저장누름." + $("textarea[name='reply']").val())
			    	var replyText = $("textarea[name='reply']").val();
			    	var replyer = $("input[name='replyer']").val();
			    	var obj={		//json 코드로 갑니다. 
			    		"bno": "${board.bno}" ,
			    		"reply": replyText ,
			    		"replyer": replyer
			    	};
			    	console.log(obj);
			    	console.log("/myapp/replies/add" + ${board.bno});
			    	$.ajax({
	                    url:"/myapp/replies/add/" + ${board.bno},
	                    data:  JSON.stringify(obj),
	                    type: "post",
	        			dataType: "json",
	        			contentType: "application/json",
	                    success:function(responseData){
	                        alert(responseData);
	                        printList(responseData);
	                    }
				    });
					$("#myModal").modal("hide")

					});
				});
		</script>
</body>
</html>