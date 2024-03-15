package jp.ac.ohara.seisaku.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.ac.ohara.seisaku.model.NikkiModel;
import jp.ac.ohara.seisaku.repository.NikkiRepository;

@Service
public class NikkiService {

    @Autowired
    private NikkiRepository repository;

    public List<NikkiModel> getNikkiList() {
        return repository.findAll();
    }

    public NikkiModel getNikkiById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void saveNikki(NikkiModel nikki) {
        repository.save(nikki);
    }

    public void deleteNikki(Long id) {
        repository.deleteById(id);
    }
}
