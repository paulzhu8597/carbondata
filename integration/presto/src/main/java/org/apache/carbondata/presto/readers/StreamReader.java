/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.carbondata.presto.readers;

import java.io.IOException;

import com.facebook.presto.spi.block.Block;
import com.facebook.presto.spi.type.Type;
import org.apache.spark.sql.execution.vectorized.ColumnVector;

/**
 * Interface for StreamReader
 */
public interface StreamReader {

  Block readBlock(Type type) throws IOException;

  void setStreamData(Object[] data);

  void setVector(ColumnVector vector);

  void setVectorReader(boolean isVectorReader);

  void setBatchSize(int batchSize);


}
