package com.hand.tables.entity;

import java.io.Serializable;
import java.sql.Date;

public class Film_category implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 659315198714284657L;
	private int film_id;
	private int category_id;
	private Date last_update;

	public int getFilm_id() {
		return film_id;
	}

	public void setFilm_id(int film_id) {
		this.film_id = film_id;
	}

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public Date getLast_update() {
		return last_update;
	}

	public void setLast_update(Date last_update) {
		this.last_update = last_update;
	}

	@Override
	public String toString() {
		return "File_category [film_id=" + film_id + ", category_id=" + category_id + ", last_update=" + last_update
				+ "]";
	}

}
