package org.ibatis.constants;

public interface MybatisBootStrapConstant {

    String USE_PARALLEL_MYBATIS_PARSE = System.getProperty("isUseParallelMybatisParse");
    boolean IS_USE_PARALLEL_MYBATIS_PARSE = USE_PARALLEL_MYBATIS_PARSE != null && USE_PARALLEL_MYBATIS_PARSE.equals("1");

}
