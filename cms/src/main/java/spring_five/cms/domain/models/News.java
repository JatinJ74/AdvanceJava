package spring_five.cms.domain.models;

import java.util.Set;

import lombok.Data;

@Data
public class News {

	String id;
	
	String title;
	
	String content;
	
	String author;
	
	Set<User> mandatoryReviewers;
	Set<Review> reviewers;
	Set<Category> categories;
	Set<Tag> tags;
}
