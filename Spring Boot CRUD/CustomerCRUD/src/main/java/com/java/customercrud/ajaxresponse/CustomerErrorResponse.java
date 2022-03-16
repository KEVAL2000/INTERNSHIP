package com.java.customercrud.ajaxresponse;

import java.util.List;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerErrorResponse {

	private boolean validated;
	private Map<Object, List<String>> errorMessages;

}