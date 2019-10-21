package jp.co.axrossroad.sample;

import java.util.ArrayList;

import org.odftoolkit.simple.SpreadsheetDocument;
import org.odftoolkit.simple.table.Cell;
import org.odftoolkit.simple.table.Row;
import org.odftoolkit.simple.table.Table;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("start");
       // File excelFile = File.createTempFile("skillsheet", ".ods");
        SpreadsheetDocument odsFile = SpreadsheetDocument.loadDocument("template.ods");
        //Workbook myExcelBook = new XSSFWorkbook(new FileInputStream(file));
        Table myExcelSheet = odsFile.getSheetByName("技術経歴書");
        odsFile.removeSheet(2);

        Row row = myExcelSheet.getRowByIndex(0);
        //myExcelSheet.removeRowsByIndex(getRow, 60);
        //odsFile.appendSheet(odsFile.getSheetByName("S0"), "test");

       // myExcelSheet = odsFile.getSheetByName("S1");
       // myExcelSheet.getCellRangeByPosition(0, 10, 0, 20).merge();

        ArrayList <UserProject> userProjectDtoList = new ArrayList <UserProject>();

        ////////////////////////////////////////////////////////
        userProjectDtoList.add(new UserProject("2019/08", "2019/10", "String title", "ああああああああああ", "String processes", "N",
                "String roleName", "3", "String,platforms,s,s,sd", "q,w,w,w"));
        userProjectDtoList.add(new UserProject("2019/08", "2019/10", "String title", "あああああああああああああああああああ", "String processes", "N",
                "String roleName", "3", "String,platforms,s,s,sd", "q,w,w,w"));
        userProjectDtoList.add(new UserProject("2019/08", "2019/10", "String title", "StrinStrinStrinStrinStrinStrinStrinStri", "String processes", "N",
                "String roleName", "3", "String,platforms,s,s,sd", "q,w,w,w"));
        userProjectDtoList.add(new UserProject("2019/08", "2019/10", "String title", "StringStringStringStringString", "String processes", "N",
                "String roleName", "3", "String,platforms,s,s,sd", "q,w,w,w"));
        userProjectDtoList.add(new UserProject("2019/08", "2019/10", "String title", "String description", "String processes", "N",
                "String roleName", "3", "String,platforms,s,s,sd,j,j,j,j", "q,w,w,w"));
        userProjectDtoList.add(new UserProject("2019/08", "2019/10", "String title", "String description", "String processes", "N",
                "String roleName", "3", "String,platforms,s,s,sd", "q,w,w,w"));
        userProjectDtoList.add(new UserProject("2019/08", "2019/10", "String title", "String description", "String processes", "N",
                "String roleName", "3", "String,platforms,s,s,sd", "q,w,w,w"));
        userProjectDtoList.add(new UserProject("2019/08", "2019/10", "String title", "String description", "String processes", "N",
                "String roleName", "3", "String,platforms,s,s,sd", "q,w,w,w"));
        userProjectDtoList.add(new UserProject("2019/08", "2019/10", "String title", "String description", "String processes", "N",
                "String roleName", "3", "String,platforms,s,s,sd", "q,w,w,w"));
        userProjectDtoList.add(new UserProject("2019/08", "2019/10", "String title", "String description", "String processes", "N",
                "String roleName", "3", "String,platforms,s,s,sd", "q,w,w,w"));
        userProjectDtoList.add(new UserProject("2019/08", "2019/10", "String title", "String description", "String processes", "N",
                "String roleName", "3", "String,platforms,s,s,sd", "q,w,w,w"));
        userProjectDtoList.add(new UserProject("2019/08", "2019/10", "String title", "String description", "String processes", "N",
                "String roleName", "3", "String,platforms,s,s,sd", "q,w,w,w"));
        userProjectDtoList.add(new UserProject("2019/08", "2019/10", "String title", "String description", "String processes", "N",
                "String roleName", "3", "String,platforms,s,s,sd", "q,w,w,w"));
        userProjectDtoList.add(new UserProject("2019/08", "2019/10", "String title", "String description", "String processes", "N",
                "String roleName", "3", "String,platforms,s,s,sd", "q,w,w,w"));
        userProjectDtoList.add(new UserProject("2019/08", "2019/10", "String title", "ああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああ", "String processes", "N",
                "String roleName", "3", "String,platforms,s,s,sd", "q,w,w,w"));
        userProjectDtoList.add(new UserProject("2019/08", "2019/10", "String title", "Stringssssadadasdadasdasdasdadsadsdsdadsadasdada descriptionStringssssadadasdadasdasdasdadsadsdsdadsadasdada descriptionStringssssadadasdadasdasdasdadsadsdsdadsadasdada descriptionStringssssadadasdadasdasdasdadsadsdsdadsadasdada descriptionStringssssadadasdadasdasdasdadsadsdsdadsadasdada description", "String processes", "N",
                "String roleName", "3", "String,platforms,s,s,sd", "q,w,w,w"));

        userProjectDtoList.add(new UserProject("2019/08", "2019/10", "String title", "String description", "String processes", "N",
                "String roleName", "3", "String,platforms,s,s,sd", "q,w,w,w"));
        userProjectDtoList.add(new UserProject("2019/08", "2019/10", "String title", "String description", "String processes", "N",
                        "String roleName", "3", "String,platforms,s,s,sd", "q,w,w,w,s,s,s,s,s,s"));

////////////////////////////////////////////////////////

        int addRowCount = 0;
        int getRow = 23;
        int addPageCount = 0;
        int addRowSumm = 0;

        if (userProjectDtoList.size() == 0) {
            myExcelSheet.removeRowsByIndex(getRow, 60);
    }

    for (int i = 0; i < userProjectDtoList.size(); i++) {
        System.out.println(i);
        UserProject userProjectDto = userProjectDtoList.get(i);

        //PDFファイルでページを作って、ナビゲートする

        String[] platformsSize = userProjectDto.getDescription().split("\n");
        int projectsSize = platformsSize.length;
        System.out.println("-----------"+projectsSize);
        for (int j = 0; j < platformsSize.length; j++) {
            if (platformsSize[j].length() > 19) {
                int t = platformsSize[j].length() / 19;
                projectsSize += t;
                System.out.println("-----------"+projectsSize);
            }
        }

        if (userProjectDto.getLanguages().split(",").length - 1 > projectsSize) {
            projectsSize = userProjectDto.getLanguages().split(",").length - 1;
            System.out.println("-----------"+projectsSize);
        }
        if (userProjectDto.getPlatforms().split(",").length - 1 > projectsSize) {
            System.out.println("-----------"+projectsSize);
            projectsSize = userProjectDto.getPlatforms().split(",").length - 1;
        }
        if (projectsSize > 4) {
            addRowCount += projectsSize;
        } else {
            addRowCount += 4;
        }

        if (addRowCount > 9 * 4) {
            if (addRowSumm == 0 || (addRowCount > 14 * 4 + addRowSumm)) {

                addRowSumm = addRowCount;
                myExcelSheet.removeRowsByIndex(getRow, 60);

                int addSheetNum = addPageCount + 1;
                odsFile.appendSheet(odsFile.getSheetByName("S"+addPageCount), "S" + addSheetNum);


                myExcelSheet = odsFile.getSheetByName("S"+addPageCount);


                getRow = 0;
                addPageCount++;
            }

        }/*
        System.out.println(myExcelSheet.getTableName());
        System.out.println(getRow);
        System.out.println(userProjectDto.getTitle());*/
        //---ページをナビゲート
        row = myExcelSheet.getRowByIndex(getRow);

        System.out.println("-----------");

        row.getCellByIndex(0).setStringValue(String.valueOf(i + 1));
        row.getCellByIndex(47).setStringValue((userProjectDto.getStartedAt() + "/01").replaceAll("/", "-"));
        row.getCellByIndex(5).setStringValue(userProjectDto.getTitle());
        setContentCell(odsFile,29,row,userProjectDto.getPlatforms());
        setContentCell(odsFile,37,row,userProjectDto.getLanguages());

       /* for (int j = 0; j < userProjectDto.getProcesses().size(); j++) {
            switch (userProjectDto.getProcesses().get(j).getCode()) {
            case "BI":
                row.getCellByIndex(20).setStringValue("●");
                break;
            case "BD":
                row.getCellByIndex(21).setStringValue("●");
                break;
            case "FD":
                row.getCellByIndex(22).setStringValue("●");
                break;
            case "DD":
                row.getCellByIndex(23).setStringValue("●");
                break;
            case "MUT":
                row.getCellByIndex(24).setStringValue("●");
                break;
            case "ST":
                row.getCellByIndex(25).setStringValue("●");
                break;
            case "PT":
                row.getCellByIndex(26).setStringValue("●");
                break;
            case "OP":
                row.getCellByIndex(27).setStringValue("●");
                break;
            case "ETC":
                row.getCellByIndex(28).setStringValue("●");
                break;
            default:
                break;
            }
        }*/
        row = myExcelSheet.getRowByIndex(getRow + 1);
        row.getCellByIndex(47).setStringValue((userProjectDto.getFinishedAt() + "/01").replaceAll("/", "-"));
        //row.getCellByIndex(5).setStringValue(userProjectDto.getDescription());
        row.getCellByIndex(20).setStringValue(userProjectDto.getRoleCode());
        row.getCellByIndex(26).setStringValue(String.valueOf(userProjectDto.getNumberOfMembers()));

        row = myExcelSheet.getRowByIndex(getRow + 2);
        row.getCellByIndex(47).setStringValue(userProjectDto.getDescription());

        getRow += 4;
        if (projectsSize > 4) {
            System.out.println("-----------ww" + getRow);
            myExcelSheet.getRowByIndex(getRow - 1).setHeight((projectsSize - 3) * 3.75, false);
        }

        if (i == userProjectDtoList.size() - 1) {
                myExcelSheet.removeRowsByIndex(getRow, 60);
        }

    }

    odsFile.removeSheet(odsFile.getSheetCount()-1);

        odsFile.save("test.ods");

        //odsFile.save(excelFile);
        System.out.println("finish");
    }

    private static void setContentCell(SpreadsheetDocument odsFile, int cellNumber, Row row, String content ) {
        // reolace comma with enter
        String contentVertical = content.replace(",", "\n");
        Cell cell = row.getCellByIndex(cellNumber);
        cell.setStringValue(contentVertical);

    }
}
