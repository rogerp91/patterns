/*
 * Copyright (c) 2016. Alejandro Sánchez.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package es.asy.patterns.creational.factorymethod.model;

/**
 * Class that represents one type of enviroment: Development Environment.
 *
 * @author asanchezyu@gmail.com.
 * @version 1.0.
 * @since 8/4/16.
 */
public class DevEnvironment implements Environment {

    @Override
    public String getBlogUrl() {

        return "http://localhost:8080/myBlog";

    }
}
