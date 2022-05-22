package com.core.consultreasons.presenter;

import java.util.List;

import com.core.consultreasons.model.ResponseModel;
import com.core.consultreasons.model.TypeReason;
import org.springframework.stereotype.Component;

@Component
public class TypeReasonPresenter {


    public ResponseModel<List<TypeReason>> setResponse(List<TypeReason> typeReasons){
        return new ResponseModel<List<TypeReason>>("00", "Tu consulta ha sido exitosa", typeReasons);
    }
    
}
