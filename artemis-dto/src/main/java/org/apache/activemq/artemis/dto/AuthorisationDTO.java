/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.activemq.artemis.dto;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "authorisation")
@XmlAccessorType(XmlAccessType.FIELD)
public class AuthorisationDTO {

   @XmlElementRef(required = false)
   @Deprecated(forRemoval = true)
   WhiteListDTO whitelist;

   @XmlElementRef(required = false)
   AllowListDTO allowList;

   @XmlElementRef
   DefaultAccessDTO defaultAccess;

   @XmlElementRef
   RoleAccessDTO roleAccess;

   @Deprecated(forRemoval = true)
   public WhiteListDTO getWhiteList() {
      return whitelist;
   }

   public AllowListDTO getAllowList() {
      return allowList;
   }

   public DefaultAccessDTO getDefaultAccess() {
      return defaultAccess;
   }

   public RoleAccessDTO getRoleAccess() {
      return roleAccess;
   }
}
