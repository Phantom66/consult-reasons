package com.core.consultreasons.controller;

import java.util.List;
import com.core.consultreasons.model.ResponseModel;
import com.core.consultreasons.model.TypeReasonResponse;
import com.core.consultreasons.service.TypeReasonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/")
@RestController
public class TypeReasonController {

    @Autowired
    private TypeReasonServiceImpl typeReasonRepository;

    @GetMapping("find-reasons")
    public ResponseEntity<ResponseModel<List<TypeReasonResponse>>> findTypeReasons() {
        return new ResponseEntity<>(typeReasonRepository.find(), HttpStatus.OK);
    }

}
