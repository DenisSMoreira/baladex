package com.denism.core.entity;

/**
 * Status
 * 
 * @author denism
 * @version $Rev$ $Date$
 */
public enum Status {

	NO_PROGRESS(0, "Não realizada"), PROGRESS(1, "Em progresso"), FINISHED(2, "Finalizada");

	private final int code;
	private final String description;

	Status(int code, String description) {
		this.code = code;
		this.description = description;
	}

	/**
	 * get Description
	 * @return description
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * get Code
	 * @return code
	 */ 
	public int getCode() {
		return this.code;
	}

	public static Status fromId(int id) {
		final Status[] values = Status.values();
		for (Status type : values) {
			if (type.getCode() == id) {
				return type;
			}
		}
		return null;
	}
}
