package com.example.controller;


import com.example.domain.ReadingFiles;
import com.example.repos.FilesRepo;
import com.example.domain.Files;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;

@Controller
public class MainController {

    @Autowired
    private FilesRepo filesRepo;


    @GetMapping("/main")
    public String read(Model m) throws IOException {
        ReadingFiles file = new ReadingFiles();
        file.setNameOfFile("data5.txt");
        String[] content = file.readFile().split("[\\r\\n]+###");

        for (int i = 1; i < content.length;i++) {

            String rrrr = content[i];

            String[] content1 = rrrr.split("###");
            String conc = new String();
            conc = conc.concat(content1[0]);
            conc = conc.concat(" ");

            conc = conc.concat(content1[1]);
            Files fileUsr = new Files(conc,content1[5],content1[6],content1[9]);
            filesRepo.save(fileUsr);
        }
        Iterable<Files> messages = filesRepo.findAll();
        filesRepo.deleteAll(messages);
        m.addAttribute("messages", messages);
        return "main";
    }



}
