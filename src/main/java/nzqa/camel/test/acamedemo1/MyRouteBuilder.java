/**
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
package nzqa.camel.test.acamedemo1;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.spring.Main;


/**
 * A Camel Router
 */
public class MyRouteBuilder extends RouteBuilder {

    /**
     * A main() so we can easily run these routing rules in our IDE
     * @param args
     * @throws java.lang.Exception
     */
    public static void main(String... args) throws Exception {
        System.out.println("testing build job");
        System.out.println("testing build job....");
        System.out.println("testing build job....");
        System.out.println("testing build job....");
        
        Main.main(args);
    }

    /**
     * Lets configure the Camel routing rules using Java code...
     */
    @Override
    public void configure() {

        // TODO create Camel routes here.

        // here is a sample which processes the input files
        // (leaving them in place - see the 'noop' flag)
        // then performs content based routing on the message
        // using XPath
        /**/
        from("file:src/data?noop=true").
            choice().
                when(xpath("/person/city = 'Dhaka'")).to("file:target/messages/uk").
                otherwise().to("file:target/messages/others");
                
    }
}
