package com.ecnu.bussystem.service;

import com.ecnu.bussystem.entity.timetable.LineTimetable;
import com.ecnu.bussystem.entity.timetable.StationTimetable;

import java.util.List;

public interface TimetableService {
    // 指定站点id、线路、时间查找数量为count的班次
    StationTimetable findTimetableByIdAndTime(String time, String stationId, String lineName, String count);

    // 指定站点name、线路、时间查找数量为count的班次
    List<StationTimetable> findTimetableByNameAndTime(String time, String stationName, String lineName, String count);

    // 指定站点name、时间、查找范围，返回所有范围内的班次
    StationTimetable findTimetableByIdAndTimeRange(String time, int range, String stationId);

    // 指定站点name、时间、查找范围，返回所有范围内的班次
    List<StationTimetable> findTimetableByNameAndTimeRange(String time, int range, String stationName);

    // 指定线路名，返回班次信息（仅支持精确名称查找）
    LineTimetable findTimetableByName(String lineName);
}