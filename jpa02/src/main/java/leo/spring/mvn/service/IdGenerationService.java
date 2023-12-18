package leo.spring.mvn.service;

import java.util.Optional;

import leo.spring.mvn.entity.DirectEntity;
import leo.spring.mvn.entity.IdentityEntity;
import leo.spring.mvn.entity.TableEntity;

public interface IdGenerationService {

    void insertDirectEntity(String name);

    Optional<DirectEntity> selectDirectEntity(String id);

    void insertIdentityEntity(String name);

    Optional<IdentityEntity> selectIdentityEntity(Long id);

    void insertTableEntity(String name);

    Optional<TableEntity> selectTableEntity(Long id);

    void insertSequenceEntity(String name);

    Optional<TableEntity> selectSequenceEntity(Long id);



}