package com.core.consultreasons.presenter;

import java.util.List;
import java.util.stream.Collectors;
import com.core.consultreasons.model.ResponseModel;
import com.core.consultreasons.model.TypeReason;
import com.core.consultreasons.model.TypeReasonResponse;
import org.springframework.stereotype.Component;

@Component
public class TypeReasonPresenter {


    public ResponseModel<List<TypeReasonResponse>> setResponse(List<TypeReason> typeReasons){
        List<TypeReasonResponse> typeReasonResponse = typeReasons.stream().map(t -> {
            TypeReasonResponse out = new TypeReasonResponse();
            setTypeReasonResponse(t, out);
            return out;
        }).collect(Collectors.toList());
        return new ResponseModel<List<TypeReasonResponse>>("00", "Tu consulta ha sido exitosa", typeReasonResponse);
    }


    private void setTypeReasonResponse(TypeReason in, TypeReasonResponse out){
        out.setId(in.getId());
        out.setDescripcionMotivo(in.getDescReason());
    }
    
}
