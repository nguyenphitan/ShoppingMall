package com.nguyenphitan.app.request;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.nguyenphitan.utils.MessageUtils;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Validate account update request
 * @author ADMIN
 *
 */
@Getter
@Setter
@ToString
public class AccountUpdateRequest {
	/** Password update */
	@ApiModelProperty(name = "password", example = "12345678", required = false)
	@NotNull(message = MessageUtils.NOT_NULL)
	@Size(min = 8, message = MessageUtils.MINIMUN_PASSWORD_CHARACTOR)
	private String password;
	
	/** Fullname update */
	@ApiModelProperty(name = "fullName", example = "Nguyen Phi Tan", required = false)
	@NotNull(message = MessageUtils.NOT_NULL)
	@NotBlank(message = MessageUtils.NOT_BLANK)
	private String fullName;
	
	/** Date of birth update */
	@ApiModelProperty(name = "dateOfBirth", example = "20-12-2001", required = false)
	@JsonFormat(pattern="yyyy-MM-dd")
	@NotNull(message = MessageUtils.NOT_NULL)
	private Date dateOfBirth;
	
	/** Phone number update */
	@ApiModelProperty(name = "phoneNumber", example = "0345621598", required = false)
	@NotNull(message = MessageUtils.NOT_NULL)
	private String phoneNumber;
	
	/** Address update */
	@ApiModelProperty(name = "address", example = "Thai Nguyen, Viet Nam", required = false)
	@NotNull(message = MessageUtils.NOT_NULL)
	private String address;
	
}
