/**
 * CopyRight (C)  2017-2018   武汉文思特信息工程有限公司
 * Author : WangWei
 * CreateTime : 2018/02/12 16:27
 * ProjectName : springboot
 * Description : 学生接口
 * Version : V1.0
 */
package com.example.springboot;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
