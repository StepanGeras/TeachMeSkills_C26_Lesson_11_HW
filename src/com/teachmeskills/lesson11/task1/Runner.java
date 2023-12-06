package com.teachmeskills.lesson11.task1;

import com.teachmeskills.lesson11.task1.task1_1.Task1_1;
import com.teachmeskills.lesson11.task1.task1_2.Task1_2;
import com.teachmeskills.lesson11.task1.task1_3.Task1_3;
import com.teachmeskills.lesson11.task1.task1_4.Task1_4;
import com.teachmeskills.lesson11.task1.task1_5.Task1_5;
import com.teachmeskills.lesson11.task1.task1_6.Task1_6;
import com.teachmeskills.lesson11.task1.task1_7.Task1_7;

public class Runner {

    public static void main(String[] args) {

        String documentNumber = "5554-abc-6543-QWE-1a2b";

        Task1_1.doPrintTwoBlock(documentNumber);
        Task1_2.doReplace(documentNumber);
        Task1_3.doLowerCase(documentNumber);
        Task1_4.doUpperCase(documentNumber);
        Task1_5.doIndexOf(documentNumber);
        Task1_6.doStartsWith(documentNumber);
        Task1_7.doEndsWith(documentNumber);

    }

}
