package com.hummer.common.mapper.mapper.ext;

import com.hummer.common.mapper.dto.CloudEventGroupDTO;
import com.hummer.common.mapper.dto.CloudEventSourceIpInsightDto;
import com.hummer.common.mapper.domain.CloudEventWithBLOBs;
import com.hummer.common.mapper.domain.request.cloudEvent.CloudEventRequest;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ExtCloudEventMapper {

    List<CloudEventWithBLOBs> getCloudEventList(@Param("request") CloudEventRequest request);

    List<CloudEventGroupDTO> selectEventGroup(@Param("request") CloudEventRequest request);
    /**
     * 批量插入云事件
     *
     * @param cloudEvents
     * @return
     */
    int batchCloudEvents(List<CloudEventWithBLOBs> cloudEvents);

    Map<String, Object> topInfo(Map<String, Object> params);

    List<Map<String, Object>> cloudChart();

    List<Map<String, Object>> regionChart();

    List<Map<String, Object>> severityChart();
    List<CloudEventSourceIpInsightDto> selectSourceIpInsight(@Param("request") CloudEventRequest request);
    List<Map<String,Object>> selectIpAccessTimesGroupByDate(@Param("ip")String ip,@Param("startDate")String startDate,@Param("endDate")String endDate);
}
