// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.packt.hotel.portal.jpa.data;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.packt.hotel.portal.jpa.data.HmsRoomBooking;

privileged aspect HmsRoomBooking_Roo_ToString {
    
    public String HmsRoomBooking.toString() {
        return new ReflectionToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).setExcludeFieldNames("bookingMenuId", "roomId", "profileId").toString();
    }
    
}