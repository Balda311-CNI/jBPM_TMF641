package com.cross;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class InsertMaterialTemplateNodeBody implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String materialTemplateName;
	private java.lang.String name;
	private java.lang.String statusDiscriminator;

	public InsertMaterialTemplateNodeBody() {
	}

	public java.lang.String getMaterialTemplateName() {
		return this.materialTemplateName;
	}

	public void setMaterialTemplateName(java.lang.String materialTemplateName) {
		this.materialTemplateName = materialTemplateName;
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.String getStatusDiscriminator() {
		return this.statusDiscriminator;
	}

	public void setStatusDiscriminator(java.lang.String statusDiscriminator) {
		this.statusDiscriminator = statusDiscriminator;
	}

	public InsertMaterialTemplateNodeBody(
			java.lang.String materialTemplateName, java.lang.String name,
			java.lang.String statusDiscriminator) {
		this.materialTemplateName = materialTemplateName;
		this.name = name;
		this.statusDiscriminator = statusDiscriminator;
	}

}