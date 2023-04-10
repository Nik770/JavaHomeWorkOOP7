package org.example.view;

import org.example.logger.Logger;
import org.example.model.Complex_Numb;

public class Out implements OutInt {
    @Override
    public void print(Complex_Numb res) {
        Logger logger = new Logger();
        logger.update(res, "Результат: ");
        System.out.println(res.toString());
    }
}
