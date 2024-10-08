import * as estree from 'estree';
import { RequiredParserServices } from '../';
export declare function isRegExpConstructor(node: estree.Node): node is estree.CallExpression;
export declare function isStringReplaceCall(call: estree.CallExpression, services: RequiredParserServices): boolean;
export declare function isStringRegexMethodCall(call: estree.CallExpression, services: RequiredParserServices): boolean;
