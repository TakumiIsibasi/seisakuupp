package jp.ac.ohara.seisaku.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.ac.ohara.seisaku.model.NikkiModel;

@Repository
public interface NikkiRepository extends JpaRepository<NikkiModel, Long> {
    
}
