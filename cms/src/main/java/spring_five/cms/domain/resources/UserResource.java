package spring_five.cms.domain.resources;

import java.util.Arrays;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import spring_five.cms.domain.models.User;
import spring_five.cms.domain.vo.NewsRequest;


@RestController
@RequestMapping("/api/user")
public class UserResource {

  @GetMapping(value = "/{id}")
  public ResponseEntity<User> findOne(@PathVariable("id") String id){
    return ResponseEntity.ok(new User());
  }

  @GetMapping
  public ResponseEntity<List<User>> findAll(){
    return ResponseEntity.ok(Arrays.asList(new User(),new User()));
  }

  @PostMapping
  public ResponseEntity<User> newUser(NewsRequest news){
    return new ResponseEntity<>(new User(), HttpStatus.CREATED);
  }

  @DeleteMapping("/{id}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void removeUser(@PathVariable("id") String id){
  }

  @PutMapping("/{id}")
  public ResponseEntity<User> updateUser(@PathVariable("id") String id,NewsRequest news){
    return new ResponseEntity<>(new User(), HttpStatus.OK);
  }

}
