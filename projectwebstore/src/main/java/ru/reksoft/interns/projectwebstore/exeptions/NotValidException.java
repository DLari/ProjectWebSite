package ru.reksoft.interns.projectwebstore.exeptions;

import org.springframework.validation.BindingResult;

public class NotValidException extends Exception {

    private BindingResult bindingResult;

    public NotValidException(BindingResult bindingResult) {
        this.bindingResult=bindingResult;
    }

    public BindingResult getBindingResult() {
        return bindingResult;
    }

    public void setBindingResult(BindingResult bindingResult) {
        this.bindingResult = bindingResult;
    }
}
