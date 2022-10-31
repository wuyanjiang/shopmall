package com.yanjiang.admin.modules.oss.cloud;


import com.yanjiang.admin.modules.sys.service.SysConfigService;
import com.yanjiang.admin.common.utils.ConfigConstant;
import com.yanjiang.admin.common.utils.Constant;
import com.yanjiang.admin.common.utils.SpringContextUtils;

/**
 * 文件上传Factory
 *
 * @author yj wuyanjiang321@163.com
 */
public final class OSSFactory {
    private static SysConfigService sysConfigService;

    static {
        OSSFactory.sysConfigService = (SysConfigService) SpringContextUtils.getBean("sysConfigService");
    }

    public static CloudStorageService build(){
        //获取云存储配置信息
        CloudStorageConfig config = sysConfigService.getConfigObject(ConfigConstant.CLOUD_STORAGE_CONFIG_KEY, CloudStorageConfig.class);

        if(config.getType() == Constant.CloudService.QINIU.getValue()){
            return new QiniuCloudStorageService(config);
        }else if(config.getType() == Constant.CloudService.ALIYUN.getValue()){
            return new AliyunCloudStorageService(config);
        }else if(config.getType() == Constant.CloudService.QCLOUD.getValue()){
            return new QcloudCloudStorageService(config);
        }

        return null;
    }

}
