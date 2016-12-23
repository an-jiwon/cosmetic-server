package com.cosmetic.controller;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import java.io.File;
import java.io.IOException;
import java.net.URL;

@Controller
@RequestMapping(value = "/fileupload")
public class FileUploadController {

    @Autowired
    ServletContext servletContext;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.TEXT_HTML_VALUE)
    public String fileUpload(Model model){
        return "fileupload";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String uploadingPost(@RequestParam("uploadingFiles") MultipartFile[] uploadingFiles) throws IOException {
        String webappRoot = servletContext.getRealPath("/");
        String uploadingdir = webappRoot + "static/upload/";

        for(MultipartFile uploadedFile : uploadingFiles) {
            File file = new File(uploadingdir + uploadedFile.getOriginalFilename());
            uploadedFile.transferTo(file);
        }

        return "fileupload";//"redirect:/";
    }
}