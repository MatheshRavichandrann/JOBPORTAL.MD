package com.zoro.JOBPORTAL.MD.repository;
import com.zoro.JOBPORTAL.MD.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post,String> {

}
