package org.tmaxcloud.superpx;

import com.google.gson.*;
import com.google.gson.stream.JsonReader;
import org.tmaxcloud.superpx.Dao.ProjectDAO;
import org.tmaxcloud.superpx.Dto.ProjectDto;
import org.tmaxcloud.superpx.Dto.TokenDto;
import org.tmaxcloud.superpx.service.ConnectionProvider;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static final ProjectDAO projectDAO = ProjectDAO.getInstance();

    public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException {

        Gson gson = new Gson();

        // token array 임시로 json 파일로 받아, tokenDto로 파싱;
        JsonReader jsonReader = new JsonReader(new FileReader("src/main/resources/tokenArray.json"));
        JsonObject request = gson.fromJson(jsonReader, JsonObject.class);

        JsonArray tokensArray = request.get("CommonTokenStream").getAsJsonObject().get("tokens").getAsJsonArray();
        System.out.println(tokensArray);

        List<TokenDto> srcTokens = new ArrayList<>();

        for(JsonElement obj : tokensArray) {
            JsonObject token = obj.getAsJsonObject();
            TokenDto tokenDto = gson.fromJson(token, TokenDto.class);
            System.out.println(tokenDto.toString());
            srcTokens.add(tokenDto);
        }
        // project dto로 파싱
        String bodyProj = "{\"projectId\":\"1\", filePath: \"/root\", fileName: \"/demo.java\"}";
        ProjectDto projectDto = gson.fromJson(bodyProj, ProjectDto.class);

        // db insert
        Connection conn = null;
        boolean result = false;
        Class.forName("com.mysql.cj.jdbc.Driver");
        try {
            conn = ConnectionProvider.getConnection();
            result = projectDAO.createProject(projectDto, srcTokens, conn);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        System.out.println(srcTokens.toString());
        System.out.println(projectDto.toString());

        System.out.println(result);

    }
}