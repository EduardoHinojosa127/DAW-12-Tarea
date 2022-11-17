package com.miempresa.DTO;

import java.util.Date;

import javax.validation.constraints.*;
import com.miempresa.DTO.*;
import org.hibernate.validator.constraints.Range;

public class formularioDTO {
	@NotBlank(message = "Campo obligatorio")
	private String tipo_documento;
	
	@Range(min=0, max=999999999, message="Ingrese un número de documento correcto")
	private int num_documento;
	
	@NotBlank(message = "Campo obligatorio")
	private String ape_paterno;
	
	@NotBlank(message = "Campo obligatorio")
	private String ape_materno;
	
	@NotBlank(message = "Campo obligatorio")
	private String nombre;
	
	@NotBlank(message = "Campo obligatorio")
	private String fecha_nacimiento;
	
	@NotBlank(message = "Campo obligatorio")
	private String sexo;

	private String estado_civil;
	
	@AssertTrue(message="Debe aceptar los términos y condiciones")
	private boolean checkbox;
	
	private String situacion_laboral;
	
	@Range(min=0, max=999999999, message="Ingrese un número de RUC correcto")
	private int ruc;
	
	private opciones_sexo[] opciones_sexo;
	private opciones_estado_civil[] opciones_estado_civil;
	private opciones_situacion_laboral[] opciones_situacion_laboral;
	private opciones_tipo_documento[] opciones_tipo_documento;	
	
	
	
	public formularioDTO() {
	}
	public formularioDTO(String tipo_documento, int num_documento, String ape_paterno, String ape_materno,
			String nombre, String fecha_nacimiento, String sexo, String estado_civil, String situacion_laboral, int ruc,
			opciones_sexo[] opciones_sexo,
			opciones_estado_civil[] opciones_estado_civil,
			opciones_situacion_laboral[] opciones_situacion_laboral,
			opciones_tipo_documento[] opciones_tipo_documento, boolean checkbox) {
		this.tipo_documento = tipo_documento;
		this.num_documento = num_documento;
		this.ape_paterno = ape_paterno;
		this.ape_materno = ape_materno;
		this.nombre = nombre;
		this.fecha_nacimiento = fecha_nacimiento;
		this.sexo = sexo;
		this.estado_civil = estado_civil;
		this.situacion_laboral = situacion_laboral;
		this.ruc = ruc;
		this.opciones_sexo = opciones_sexo;
		this.opciones_estado_civil = opciones_estado_civil;
		this.opciones_situacion_laboral = opciones_situacion_laboral;
		this.opciones_tipo_documento = opciones_tipo_documento;
		this.checkbox= checkbox;
	}
	public boolean isCheckbox() {
		return checkbox;
	}
	public void setCheckbox(boolean checkbox) {
		this.checkbox = checkbox;
	}
	public String getTipo_documento() {
		return tipo_documento;
	}
	public void setTipo_documento(String tipo_documento) {
		this.tipo_documento = tipo_documento;
	}
	public int getNum_documento() {
		return num_documento;
	}
	public void setNum_documento(int num_documento) {
		this.num_documento = num_documento;
	}
	public String getApe_paterno() {
		return ape_paterno;
	}
	public void setApe_paterno(String ape_paterno) {
		this.ape_paterno = ape_paterno;
	}
	public String getApe_materno() {
		return ape_materno;
	}
	public void setApe_materno(String ape_materno) {
		this.ape_materno = ape_materno;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getEstado_civil() {
		return estado_civil;
	}
	public void setEstado_civil(String estado_civil) {
		this.estado_civil = estado_civil;
	}
	public String getSituacion_laboral() {
		return situacion_laboral;
	}
	public void setSituacion_laboral(String situacion_laboral) {
		this.situacion_laboral = situacion_laboral;
	}
	public int getRuc() {
		return ruc;
	}
	public void setRuc(int ruc) {
		this.ruc = ruc;
	}
	public opciones_sexo[] getOpciones_sexo() {
		return opciones_sexo;
	}
	public void setOpciones_sexo(opciones_sexo[] opciones_sexo) {
		this.opciones_sexo = opciones_sexo;
	}
	public opciones_estado_civil[] getOpciones_estado_civil() {
		return opciones_estado_civil;
	}
	public void setOpciones_estado_civil(opciones_estado_civil[] opciones_estado_civil) {
		this.opciones_estado_civil = opciones_estado_civil;
	}
	public opciones_situacion_laboral[] getOpciones_situacion_laboral() {
		return opciones_situacion_laboral;
	}
	public void setOpciones_situacion_laboral(opciones_situacion_laboral[] opciones_situacion_laboral) {
		this.opciones_situacion_laboral = opciones_situacion_laboral;
	}
	public opciones_tipo_documento[] getOpciones_tipo_documento() {
		return opciones_tipo_documento;
	}
	public void setOpciones_tipo_documento(opciones_tipo_documento[] opciones_tipo_documento) {
		this.opciones_tipo_documento = opciones_tipo_documento;
	}
	
}
