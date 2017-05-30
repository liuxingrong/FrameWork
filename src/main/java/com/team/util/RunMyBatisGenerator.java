package com.team.util;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by fantasy on 17-5-28.
 */
public class RunMyBatisGenerator {
    public static void run(String[] tableNames) throws Exception {
        System.out.println("正在创建dto, mapper, xml");
        String configPath = "./src/main/java/com/team/util/generatorConfig.xml";
        // modify tableName
        for (int i = 0; i < tableNames.length; i++) {
            String content = ReadWriteFile.readFile(configPath);
            content = content.replaceAll("tableName=\"[\\w\\_]+\"", "tableName=\"" + tableNames[i] + "\"");
            ReadWriteFile.modifyFile(configPath, content);

            List<String> warnings = new ArrayList<String>();
            boolean overwrite = true;
            File configFile = new File(configPath);

            ConfigurationParser cp = new ConfigurationParser(warnings);
            Configuration config = cp.parseConfiguration(configFile);
            DefaultShellCallback callback = new DefaultShellCallback(overwrite);
            MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
            myBatisGenerator.generate(null);
        }

        System.out.println("生成Mybatis配置成功！");
    }
}
