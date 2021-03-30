package com.invest.honduras.error;

public class ErrorCode {


	public static final String MESSAGE_USER_EMAIL_EXIST = "Email ya existe";
	public static final String MESSAGE_USER_NOT_EXIST = "Usuario no existe";
	public static final String MESSAGE_USER_EMAIL_EMPTY = "Email está vacío";
	public static final String MESSAGE_USER_EMAIL_NOT_EXIST = "Email no existe";
	public static final String MESSAGE_USER_EMAIL_NOT_PERMIT = "Actualizacion no permitida";
	public static final String MESSAGE_USER_ROLE_EMPTY = "Rol está vacío";
	public static final String MESSAGE_USER_ROLE_NOT_PERMIT = "Favor obtener los roles de MS-Parametros , Rol no Permitido ";
	public static final String MESSAGE_USER_SECTION_NOT_PERMIT = "Favor obtener los roles de MS-Parametros , Section Page no Permitido ";
	public static final String MESSAGE_USER_ID_NOT_FOUND = "Id no existe en nuestro sistema actual ";
	public static final String MESSAGE_USER_PASSWORD_EMPTY = "Password o la confirmación de password es vacío";
	public static final String MESSAGE_USER_TYPE_EMPTY = "Tipo vacio o distinto de COMPLETE_PASSWORD o CHANGE_PASSWORD ";
	public static final String MESSAGE_USER_PASSWORD_NOT_EQUAL = "Password y la confirmación de password son diferentes";
	public static final String MESSAGE_USER_PASSWORD_REGEX = "Password debe contener al menos una mayuscula , una minuscula, caracter especial [!, $, %, @, &] y tamaño entre 12 a 20 caracteres";
	public static final String MESSAGE_USER_EMAIL_EQUAL_PASSWORD = "Password no debe ser igual a email";

}
