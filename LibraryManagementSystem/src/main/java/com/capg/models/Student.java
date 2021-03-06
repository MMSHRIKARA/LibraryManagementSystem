package com.capg.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int studentId;

	private String userName;
	private String password;
	private String firstName;
	private String lastName;
	private long contactNo;
	private String emailId;
	
	@OneToMany(mappedBy = "student")
	private List<Book> issueBook;
}
