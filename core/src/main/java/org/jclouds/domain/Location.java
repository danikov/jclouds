/**
 *
 * Copyright (C) 2009 Global Cloud Specialists, Inc. <info@globalcloudspecialists.com>
 *
 * ====================================================================
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 * ====================================================================
 */
package org.jclouds.domain;


/**
 * Running Operating system
 * 
 * @author Adrian Cole
 */
public interface Location {

   /**
    * Scope of the location, ex. region, datacenter
    * 
    */
   LocationScope getScope();

   /**
    * Unique ID provided by the provider (us-standard, miami, etc)
    * 
    */
   String getId();

   /**
    * Description of the location
    */
   String getDescription();

   /**
    * The Id of the parent, or null, if top-level
    */
   String getParent();

   /**
    * Whether nodes can be assigned to this location. It is possible that a location is a container
    * type that cannot be assigned to, or that a location is full.
    */
   boolean isAssignable();

}