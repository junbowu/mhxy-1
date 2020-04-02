package com.xw.robot.state;

import com.xw.robot.model.CityEnum;
import lombok.extern.slf4j.Slf4j;

/**
 * @Auther: xw.z
 * @Date: 2020/3/7 15:00
 * @Description:
 */
@Slf4j
public class CSJW extends SiteState {
    public void move(AutoPathContext context) {
        if (CityEnum.CAC.equals(context.getTargetCity())) {
            context.setStatus(CityEnum.BJLZ);
            this.print(CityEnum.BJLZ.getName());
            return;
        }
        if (CityEnum.JNYW.equals(context.getTargetCity())) {
            context.setStatus(CityEnum.BJLZ);
            this.print(CityEnum.BJLZ.getName());
            return;
        }
        if (CityEnum.JYC.equals(context.getTargetCity())) {
            context.setStatus(CityEnum.BJLZ);
            this.print(CityEnum.BJLZ.getName());
            return;
        }
        if (CityEnum.DHW.equals(context.getTargetCity())) {
            context.setStatus(CityEnum.BJLZ);
            this.print(CityEnum.BJLZ.getName());
            return;
        }
        if (CityEnum.ALG.equals(context.getTargetCity())) {
            context.setStatus(CityEnum.BJLZ);
            this.print(CityEnum.ALG.getName());
            return;
        }
        if (CityEnum.HGS.equals(context.getTargetCity())) {
            context.setStatus(CityEnum.BJLZ);
            this.print(CityEnum.BJLZ.getName());
            return;
        }
        if (CityEnum.BJLZ.equals(context.getTargetCity())) {
            context.setStatus(CityEnum.BJLZ);
            this.print(CityEnum.BJLZ.getName());
            return;
        }
        if (CityEnum.CSJW.equals(context.getTargetCity())) {
            return;
        }
        if (CityEnum.CSC.equals(context.getTargetCity())) {
            context.setStatus(CityEnum.CSC);
            this.print(CityEnum.CSC.getName());
            return;
        }

        if (CityEnum.DTJW.equals(context.getTargetCity())) {
            context.setStatus(CityEnum.DTJW);
            this.print(CityEnum.DTJW.getName());
            return;
        }
        if (CityEnum.DTGJ.equals(context.getTargetCity())) {
            context.setStatus(CityEnum.DTJW);
            this.print(CityEnum.DTJW.getName());
            return;
        }
    }

}