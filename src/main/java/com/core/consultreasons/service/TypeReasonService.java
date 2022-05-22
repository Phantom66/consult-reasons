package com.core.consultreasons.service;

import java.util.List;
import com.core.consultreasons.model.ResponseModel;
import com.core.consultreasons.model.TypeReasonResponse;

public interface TypeReasonService {
    
    public ResponseModel<List<TypeReasonResponse>>find();
}
