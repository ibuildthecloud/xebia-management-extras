/*
 * Copyright 2008-2010 Xebia and the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package fr.xebia.management.jms;

import java.util.List;

/**
 * 
 * @author <a href="mailto:cyrille@cyrilleleclerc.com">Cyrille Le Clerc</a>
 */
public interface ManagedConnectionFactoryMBean {

    int getActiveConnectionCount();

    int getActiveMessageConsumerCount();

    int getActiveMessageProducerCount();

    int getActiveSessionCount();

    int getCloseConnectionCount();

    int getCloseMessageConsumerCount();

    int getCloseMessageProducerCount();

    int getCloseSessionCount();

    int getCreateConnectionCount();

    int getCreateConnectionExceptionCount();

    int getCreateMessageConsumerCount();

    int getCreateMessageConsumerExceptionCount();

    int getCreateMessageProducerCount();

    int getCreateMessageProducerExceptionCount();

    int getCreateSessionCount();

    int getCreateSessionExceptionCount();

    int getReceiveMessageCount();

    long getReceiveMessageDurationInMillis();

    int getReceiveMessageExceptionCount();

    int getSendMessageCount();

    long getSendMessageDurationInMillis();

    int getSendMessageExceptionCount();

    /**
     * Readonly to prevent thread safety issues.
     */
    boolean isTrackLeaks();

    /**
     * <p>
     * List of opened connection / session / message producer / message consumer
     * / topic subscriber.
     * </p>
     * <p>
     * Only available if trace-leaks is enabled. Otherwise, an empty list is returned.
     * </p>
     */
    List<String> dumpAllOpenedResources();
}
