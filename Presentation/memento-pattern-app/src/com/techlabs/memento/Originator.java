package com.techlabs.memento;

public class Originator {
	private String article;

	public void setArticle(String article) {
		this.article = article;
	}

	public String getArticle() {
		return article;
	}

	public Memento save() {
		return new Memento(article);
	}

	public void restore(Memento m) {
		this.article = m.getState();
	}
}
