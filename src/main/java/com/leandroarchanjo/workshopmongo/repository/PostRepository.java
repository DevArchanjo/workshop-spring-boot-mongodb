package com.leandroarchanjo.workshopmongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.leandroarchanjo.workshopmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

	//esse método vai retornar uma lista de Post
	//o nome do método vai ser findBy -> buscar por/encontrar por
	//nome do atributo que queremos buscar neste caso é o Title
	//na frente usamos a palavra Containing recebendo uma string como argumento
	//a palavra IgnoreCase faz com que ao buscar um titulo o banco ignore letras maiúsculas e minúsculas
	List<Post> findByTitleContainingIgnoreCase(String text); //-> só essa declaração faz com que o springData monte a consulta para nós
}