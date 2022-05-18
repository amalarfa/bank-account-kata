package com.sg.katabank.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Account {

	    private Long accountId;
	    private Long customerId;
	    private LocalDateTime dateCreation;
	    private Double balance;
	    private String type;	   
	    private List<Operation> operations = new ArrayList<>();
	    
	    
	    public void addOperation(Operation operation) {
	        this.operations.add(operation);
	      
	    }
}
