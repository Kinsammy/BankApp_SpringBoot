package data.repository;

import data.model.Account;
import data.model.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<Users,String> {
}
