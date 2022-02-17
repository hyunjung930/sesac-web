package com.sesac.springBootMVCProject.vo;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name="tbl2_boards")
@Entity
public class BoardVO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)		//oracle은 sequence를 사용(이름: hiberate_sequence)bno 알아서 증가
	private Long bno;
	@NonNull		//java에서 객체 생성시 필수.
	@Column(nullable = false)		//DB에서 notnull컬럼으로 설정
	private String title;
	private String writer;
	@Column(length = 100)
	private String content;
	@CreationTimestamp	//생성시 입력됨
	private Timestamp regdate;
	@UpdateTimestamp	//생성시 입력되고 수정시 수정됨
	private Timestamp updatedate;
	
}
