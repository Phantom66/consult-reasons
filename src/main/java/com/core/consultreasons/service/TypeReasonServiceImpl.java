package com.core.consultreasons.service;

import java.util.List;
import com.core.consultreasons.model.ResponseModel;
import com.core.consultreasons.model.TypeReason;
import com.core.consultreasons.presenter.TypeReasonPresenter;
import com.core.consultreasons.repository.TypeReasonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class TypeReasonServiceImpl implements TypeReasonService {

    @Autowired
    private TypeReasonRepository typeReasonRepository;
    @Autowired
    private TypeReasonPresenter typeReasonPresenter;

    @Override
    public ResponseModel<List<TypeReason>> find() {
        log.info("Service ...");
        typeReasonRepository.findAll().stream().forEach(System.out::println);
        return typeReasonPresenter.setResponse(typeReasonRepository.findAll());
    }

}
