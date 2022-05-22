package com.core.consultreasons.service;

import java.util.List;

import com.core.consultreasons.model.ResponseModel;
import com.core.consultreasons.model.TypeReason;

public interface TypeReasonService {
    
    public ResponseModel<List<TypeReason>>find();
}
