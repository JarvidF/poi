/* ====================================================================
   Copyright 2003-2005   Apache Software Foundation

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
==================================================================== */


package org.apache.poi.hssf.record.formula;

/**
 * Title:        Deleted Reference 3D Ptg <P>
 * Description:  Defined a cell in extern sheet. <P>
 * REFERENCE:  <P>
 * @author Patrick Luby
 * @version 1.0-pre
 */

public class DeletedRef3DPtg extends Ref3DPtg {
    public final static byte sid  = 0x3c;

    /** Creates new DeletedRef3DPtg */
    public DeletedRef3DPtg(byte[] data, int offset) {
        super(data, offset);
    }

    public DeletedRef3DPtg(String cellref, short externIdx ) {
        super(cellref, externIdx);
    }
}
