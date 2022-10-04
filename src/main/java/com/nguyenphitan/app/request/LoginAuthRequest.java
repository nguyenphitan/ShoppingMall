package com.nguyenphitan.app.request;

import java.io.Serializable;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.nguyenphitan.utils.MessageUtils;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Validate login auth request
 * @author ADMIN
 *
 */
@Getter
@Setter
@ToString
@Data
public class LoginAuthRequest implements Serializable{
	
	/**
	 * Serial version uid
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Email request
	 */
	@ApiModelProperty(name = "email", example = "tan@gamil.com", required = false)
	@NotNull(message = MessageUtils.NOT_NULL)
	private String email;
	
	/**
	 * Password request
	 */
	@ApiModelProperty(name = "password", example = "Abc12@", required = false)
	@NotNull(message = MessageUtils.NOT_NULL)
	@Min(value = 8, message = MessageUtils.MINIMUN_PASSWORD_CHARACTOR)
	private String password;
}
