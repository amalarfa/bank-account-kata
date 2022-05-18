package com.sg.katabank.model;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Operation {
	    private Long operationId;
	    private Long accountId;
	    private OperationTypeEnum operationType;
	    private LocalDateTime operationDateTime;
	    private Double amount;
	    
		public Operation(OperationTypeEnum operationType,Double amount) {
			super();
			this.operationType = operationType;
			this.operationDateTime = LocalDateTime.now();
			this.amount = amount;
		}
		 @Override
		    public String toString() {
		        return operationType.name() + "of " + amount + " at " + operationDateTime.toString() ;
		    } 
}
