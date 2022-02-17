package com.sesac.springBootMVCProject.vo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(exclude = "files2")
@Entity
@Table(name = "tbl_pdsboard")
@EqualsAndHashCode(of = "pid")
public class PDSBoard {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long pid;
	private String pname;
	private String pwriter;

	@OneToMany(cascade = CascadeType.ALL, 
			fetch = FetchType.EAGER)	
	//cascade내변화에 따라 같이 변해줘	EAGER: 변화실행하면 같이 실행
	@JoinColumn(name = "pdsno") // PDSFile칼럼에 생성	// pdsno는 PDSFile의 번호 
	private List<PDSFile> files2;
	
	
}
