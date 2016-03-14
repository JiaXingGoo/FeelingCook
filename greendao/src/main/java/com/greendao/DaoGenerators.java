package com.greendao;

import de.greenrobot.daogenerator.DaoGenerator;
import de.greenrobot.daogenerator.Schema;

public class DaoGenerators {
    public static void main(String[] args) throws Exception {
        String path = "../FeelingCook/app/src/main/java";
        if (args.length >= 1) {
            path = args[0];
        }
        Schema schema = new Schema(1,"com.feelingcook.db");
        addAllSchema(schema);
        new DaoGenerator().generateAll(schema, path);
}

    private static void addAllSchema(Schema schema) {

    }
}
