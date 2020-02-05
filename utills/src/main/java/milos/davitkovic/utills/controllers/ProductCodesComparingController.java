package milos.davitkovic.utills.controllers;

import milos.davitkovic.utills.facade.ProductCodesComparingFacade;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.IOException;

@RestController
@RequestMapping(value = "comparing/")
public class ProductCodesComparingController {

    @Resource
    private ProductCodesComparingFacade productCodesComparingFacade;

    @GetMapping(value = "/productCodesComparing")
    @ResponseStatus(value = HttpStatus.ACCEPTED)
    public void productCodesComparing() throws IOException {
        final String fileName1 = "File1.txt";
        final String fileName2 = "File2.txt";
        final String folderName = "files/compare";
        final String resultFileName = "Result.txt";
        productCodesComparingFacade.compare2Files(folderName, fileName1, fileName2, resultFileName);
    }
}
