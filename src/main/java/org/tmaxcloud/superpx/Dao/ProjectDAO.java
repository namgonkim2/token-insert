package org.tmaxcloud.superpx.Dao;

import org.tmaxcloud.superpx.Dto.ProjectDto;
import org.tmaxcloud.superpx.Dto.TokenDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class ProjectDAO {
    private static ProjectDAO dao = new ProjectDAO();

    private ProjectDAO() {

    }
    public static ProjectDAO getInstance() {
        return dao;
    }

    public boolean createProject(ProjectDto projectDto, List<TokenDto> tokenDtoList, Connection conn) {
        boolean resultCnt = false;

        // project 저장
        String projectSql = "insert into project values(?, ?, ?)";
        try {
            PreparedStatement pstmt = conn.prepareStatement(projectSql);
            pstmt.setInt(1, projectDto.getProjectId());
            pstmt.setString(2, projectDto.getFilePath());
            pstmt.setString(3,projectDto.getFileName());

            resultCnt = pstmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // token 저장
        String tokenSql = "insert into token values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement pstmt = conn.prepareStatement(tokenSql);
            for(TokenDto tokenDto : tokenDtoList) {
                pstmt.setInt(1, tokenDto.getTokenId());
                pstmt.setInt(2, tokenDto.getProjectId());
                pstmt.setInt(3, tokenDto.getIndex());
                pstmt.setString(4, tokenDto.getSource());
                pstmt.setInt(5, tokenDto.getStart());
                pstmt.setInt(6, tokenDto.getStartIndex());
                pstmt.setInt(7, tokenDto.getStop());
                pstmt.setInt(8, tokenDto.getStopIndex());
                pstmt.setInt(9, tokenDto.getChannel());
                pstmt.setInt(10, tokenDto.getCharPositionInLine());
                pstmt.setString(11, tokenDto.getInputStream());
                pstmt.setInt(12, tokenDto.getLine());
                pstmt.setString(13, tokenDto.getText());
                pstmt.setInt(14, tokenDto.getTokenIndex());
                pstmt.setString(15, tokenDto.getTokenSource());
                pstmt.setInt(16, tokenDto.getType());

                pstmt.execute();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return resultCnt;
    }
}
